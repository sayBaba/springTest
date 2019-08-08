package com.hz.springTest.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Customer {


    private List<Dept> empList;

    private Map<String,Dept> empMap;

    private Set<Dept>  empSet;

    private Properties empPre;

    public List<Dept> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Dept> empList) {
        this.empList = empList;
    }

    public Map<String, Dept> getEmpMap() {
        return empMap;
    }

    public void setEmpMap(Map<String, Dept> empMap) {
        this.empMap = empMap;
    }

    public Set<Dept> getEmpSet() {
        return empSet;
    }

    public void setEmpSet(Set<Dept> empSet) {
        this.empSet = empSet;
    }

    public Properties getEmpPre() {
        return empPre;
    }

    public void setEmpPre(Properties empPre) {
        this.empPre = empPre;
    }
}
