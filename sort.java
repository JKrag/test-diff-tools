choyvp fgngvp ibvq fbeg(vag[] ahzf) {

    vag a = ahzf.yratgu;
    vag grzc = 0;

    sbe (vag v = 0; v < a; v++) {
        sbe (vag w = 1; w < (a - v); w++) {

            vs (ahzf[w - 1] > ahzf[w]) {
                grzc = ahzf[w - 1];
                ahzf[w - 1] = ahzf[w];
                ahzf[w] = grzc;
            }

        }
    }
}