package org.apache.commons.compress.archivers.zip;

import com.cmaster.cloner.md1;
import com.cmaster.cloner.nd1;
import com.cmaster.cloner.nz;
import com.cmaster.cloner.sa;
import com.cmaster.cloner.xg0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class ParallelScatterZipCreator {
    private final nd1 backingStoreSupplier;
    private long compressionDoneAt;
    private final ExecutorService es;
    private final List<Future<Object>> futures;
    private long scatterDoneAt;
    private final long startedAt;
    private final List<ScatterZipOutputStream> streams;
    private final ThreadLocal<ScatterZipOutputStream> tlScatterStreams;

    /* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
    public static class DefaultBackingStoreSupplier implements nd1 {
        final AtomicInteger storeNum;

        private DefaultBackingStoreSupplier() {
            this.storeNum = new AtomicInteger(0);
        }

        @Override // com.cmaster.cloner.nd1
        public md1 get() {
            return new nz(File.createTempFile("parallelscatter", "n" + this.storeNum.incrementAndGet()));
        }
    }

    public ParallelScatterZipCreator(ExecutorService executorService, nd1 nd1Var) {
        this.streams = Collections.synchronizedList(new ArrayList());
        this.futures = new ArrayList();
        this.startedAt = System.currentTimeMillis();
        this.compressionDoneAt = 0L;
        this.tlScatterStreams = new ThreadLocal<ScatterZipOutputStream>() { // from class: org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator.1
            @Override // java.lang.ThreadLocal
            public ScatterZipOutputStream initialValue() {
                try {
                    ParallelScatterZipCreator parallelScatterZipCreator = ParallelScatterZipCreator.this;
                    ScatterZipOutputStream scatterZipOutputStreamCreateDeferred = parallelScatterZipCreator.createDeferred(parallelScatterZipCreator.backingStoreSupplier);
                    ParallelScatterZipCreator.this.streams.add(scatterZipOutputStreamCreateDeferred);
                    return scatterZipOutputStreamCreateDeferred;
                } catch (IOException e) {
                    sa.OooOO0(e);
                    return null;
                }
            }
        };
        this.backingStoreSupplier = nd1Var;
        this.es = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ScatterZipOutputStream createDeferred(nd1 nd1Var) {
        md1 md1Var = nd1Var.get();
        return new ScatterZipOutputStream(md1Var, StreamCompressor.create(-1, md1Var));
    }

    public void addArchiveEntry(ZipArchiveEntry zipArchiveEntry, xg0 xg0Var) {
        submit(createCallable(zipArchiveEntry, xg0Var));
    }

    public final Callable<Object> createCallable(ZipArchiveEntry zipArchiveEntry, xg0 xg0Var) {
        if (zipArchiveEntry.getMethod() != -1) {
            final ZipArchiveEntryRequest zipArchiveEntryRequestCreateZipArchiveEntryRequest = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry, xg0Var);
            return new Callable<Object>() { // from class: org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator.2
                @Override // java.util.concurrent.Callable
                public Object call() throws IOException {
                    ((ScatterZipOutputStream) ParallelScatterZipCreator.this.tlScatterStreams.get()).addArchiveEntry(zipArchiveEntryRequestCreateZipArchiveEntryRequest);
                    return null;
                }
            };
        }
        sa.OooOO0o(zipArchiveEntry, "Method must be set on zipArchiveEntry: ");
        return null;
    }

    public ScatterStatistics getStatisticsMessage() {
        long j = this.compressionDoneAt;
        return new ScatterStatistics(j - this.startedAt, this.scatterDoneAt - j);
    }

    public final void submit(Callable<Object> callable) {
        this.futures.add(this.es.submit(callable));
    }

    public void writeTo(ZipArchiveOutputStream zipArchiveOutputStream) throws ExecutionException, InterruptedException, IOException {
        Iterator<Future<Object>> it = this.futures.iterator();
        while (it.hasNext()) {
            it.next().get();
        }
        this.es.shutdown();
        this.es.awaitTermination(60000L, TimeUnit.SECONDS);
        this.compressionDoneAt = System.currentTimeMillis();
        for (ScatterZipOutputStream scatterZipOutputStream : this.streams) {
            scatterZipOutputStream.writeTo(zipArchiveOutputStream);
            scatterZipOutputStream.close();
        }
        this.scatterDoneAt = System.currentTimeMillis();
    }

    public ParallelScatterZipCreator(ExecutorService executorService) {
        this(executorService, new DefaultBackingStoreSupplier());
    }

    public ParallelScatterZipCreator() {
        this(Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors()));
    }
}
