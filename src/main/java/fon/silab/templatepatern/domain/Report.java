/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.silab.templatepatern.domain;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Veljko
 */
public class Report {

    private Date date;
    private Manager manager;
    private List<String> items;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Report{" + "date=" + date + ", manager=" + manager + ", items=" + items + '}';
    }

    

}
