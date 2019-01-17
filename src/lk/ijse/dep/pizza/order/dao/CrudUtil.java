package lk.ijse.dep.pizza.order.dao;

import lk.ijse.dep.pizza.order.db.DBConnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudUtil {

    private CrudUtil(){}
    public static PreparedStatement getPreparedStatement(String sql, Object... params) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        int parametersCount = getParametersCount(sql);
        if (parametersCount != params.length) {
            throw new RuntimeException("Parameter count mismatched error");
        }
        for (int i = 0; i < parametersCount; i++) {
            pstm.setObject(i + 1, params[i]);
        }
        return pstm;
    }

    private static int getParametersCount(String sql) {
        return sql.concat(" ").split("[?]").length - 1;
    }
}
