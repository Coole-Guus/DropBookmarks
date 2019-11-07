package com.udemy.persistence;

import com.udemy.model.Experiment;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ExperimentMapper implements ResultSetMapper<Experiment> {
    @Override
    public Experiment map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
        Experiment mappedExperiment = new Experiment();
        mappedExperiment.setExperiment_naam(resultSet.getString("experiment_naam"));
        mappedExperiment.setWijziging_datum(resultSet.getString("wijziging_datum"));
        mappedExperiment.setFase(resultSet.getString("fase"));
        mappedExperiment.setColor(resultSet.getString("status_kleur"));
        mappedExperiment.setExperiment_leider(resultSet.getString("experiment_leider"));
        mappedExperiment.setExperimentId(resultSet.getInt("experiment_ID"));
        return mappedExperiment;
    }
}
