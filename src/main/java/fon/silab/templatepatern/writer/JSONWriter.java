/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.silab.templatepatern.writer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;

/**
 *
 * @author Veljko
 * @param <T>
 */
public class JSONWriter<T> extends AbstractWriter<T> {

    private Gson gson;
    FileWriter fileWriter;

    @Override
    protected void initializeFileWriter() throws Exception {
        this.gson = new GsonBuilder().setPrettyPrinting().create();
        fileWriter = new FileWriter(filePath);
    }

    @Override
    protected void setFileExtension() {
        filePath += ".json";
    }

    @Override
    protected void writeToFile() {
        gson.toJson(object, fileWriter);
    }

    @Override
    protected void closeFile() throws Exception {
        fileWriter.flush();
        fileWriter.close();
    }

}
