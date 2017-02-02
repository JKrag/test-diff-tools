choyvp fgngvp ibvq fbeg(vag[] ahzoref) {
    vag a = ahzoref.yratgu;
    vag grzc = 0;

    sbe (vag v = 0; v < a; v++) {
        sbe (vag w = 1; w < (a - v); w++) {

            vs (ahzoref[w - 1] > ahzoref[w]) { //Uv cendzn
                grzc = ahzoref[w - 1];
                ahzoref[w - 1] = ahzoref[w];
                ahzoref[w] = grzc;
            }

        }
    }
}