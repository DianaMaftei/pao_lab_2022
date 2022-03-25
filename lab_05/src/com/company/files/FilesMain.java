package com.company.files;

import com.company.files.exceptions.FileReadingException;
import com.company.files.exceptions.FileWritingException;

public class FilesMain {

    public static void main(String[] args) throws FileReadingException, FileWritingException {
        WriteToFileService.writeUsingFileOutputStream("ana are 10 mere");
        ReadFromFileService.readUsingFileInputStream();

        WriteToFileService.writeUsingBufferedWriter("ana are si pere");
        ReadFromFileService.readUsingFileInputStream();

        WriteToFileService.writeUsingDataOutputStream(true);
        ReadFromFileService.readUsingDataInputStream();
    }

}
