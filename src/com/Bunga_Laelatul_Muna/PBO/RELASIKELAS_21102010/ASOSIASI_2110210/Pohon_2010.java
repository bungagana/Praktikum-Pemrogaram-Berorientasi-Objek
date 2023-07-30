package com.Bunga_Laelatul_Muna.PBO.RELASIKELAS_21102010.ASOSIASI_2110210;

import java.util.ArrayList;
import java.util.List;

public class Pohon_2010 {
    private String jenisPohon_2010;
    private int usiaPohon_2010;
    private List<Daun_2010> daunList_2010;

    public Pohon_2010(String jenisPohon, int usiaPohon) {
        this.jenisPohon_2010 = jenisPohon;
        this.usiaPohon_2010 = usiaPohon;
        this.daunList_2010 = new ArrayList<>();
    }

    public void tambahDaun(String jenisDaun, String warnaDaun) {
        Daun_2010 daun = new Daun_2010(jenisDaun, warnaDaun);
        daunList_2010.add(daun);
    }

    public void hapusDaun() {
        daunList_2010.clear();
    }

    public String getJenisPohon() {
        return jenisPohon_2010;
    }

    public int getUsiaPohon() {
        return usiaPohon_2010;
    }

    public List<Daun_2010> getDaunList() {
        return daunList_2010;
    }
}
