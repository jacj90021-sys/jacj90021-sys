package com.cmaster.cloner;

import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class pb extends qb {
    public final /* synthetic */ int OooO0O0;
    public final /* synthetic */ CarouselLayoutManager OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb(CarouselLayoutManager carouselLayoutManager, int i) {
        super(1);
        this.OooO0O0 = i;
        switch (i) {
            case 1:
                this.OooO0OO = carouselLayoutManager;
                super(0);
                break;
            default:
                this.OooO0OO = carouselLayoutManager;
                break;
        }
    }

    @Override // com.cmaster.cloner.qb
    public final int OooO0O0() {
        int i = this.OooO0O0;
        CarouselLayoutManager carouselLayoutManager = this.OooO0OO;
        switch (i) {
            case 0:
                return carouselLayoutManager.OooOOOO;
            default:
                return carouselLayoutManager.OooOOOO - carouselLayoutManager.OooOooO();
        }
    }

    @Override // com.cmaster.cloner.qb
    public final int OooO0OO() {
        switch (this.OooO0O0) {
            case 0:
                return this.OooO0OO.OooOooo();
            default:
                return 0;
        }
    }

    @Override // com.cmaster.cloner.qb
    public final int OooO0Oo() {
        int i = this.OooO0O0;
        CarouselLayoutManager carouselLayoutManager = this.OooO0OO;
        switch (i) {
            case 0:
                return carouselLayoutManager.OooOOO - carouselLayoutManager.Oooo000();
            default:
                return carouselLayoutManager.OooOOO;
        }
    }

    @Override // com.cmaster.cloner.qb
    public final int OooO0o() {
        switch (this.OooO0O0) {
            case 0:
                return 0;
            default:
                return this.OooO0OO.Oooo00O();
        }
    }

    @Override // com.cmaster.cloner.qb
    public final int OooO0o0() {
        switch (this.OooO0O0) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.OooO0OO;
                if (carouselLayoutManager.o00000()) {
                    return carouselLayoutManager.OooOOO;
                }
                return 0;
        }
    }
}
