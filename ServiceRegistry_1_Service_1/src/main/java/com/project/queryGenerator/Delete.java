package com.project.queryGenerator;

import org.springframework.stereotype.Component;

@Component
public class Delete {
    public String getDeleteQuery(String tableName, int empId) {
        // Generating SQL Query
        String sql = "DELETE FROM " + tableName + " WHERE empid = " + empId;
        return sql;
    }
}
