package com.sam_p.pdfbox.dao;

import com.sam_p.pdfbox.models.ConfigModel;

public interface ConfigDao {
    ConfigModel getConfigBykey(int i);

    void incrementConfigValue(int i);

    void insert(ConfigModel configModel);

    void setRewarded(int i, int i2);
}
