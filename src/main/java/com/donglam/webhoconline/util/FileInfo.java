package com.donglam.webhoconline.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FileInfo {
    private int width = 0;
    private int height = 0;
    private String mime = "";
    private String fileName = "";
    private long fileSize = 0;
    private String oldName = "";
    private String fullPath = "";
}
