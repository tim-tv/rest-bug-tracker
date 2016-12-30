package com.github.titovartem.resterrortracker.dao;


import com.github.titovartem.resterrortracker.entity.ErrorReport;

import java.util.List;

/**
 * This DAO provides persistence access to
 * {@link com.github.titovartem.resterrortracker.entity.ErrorReport} instance.
 */
public interface ErrorReportDao {

    /** Adds a new error report. */
    void addErrorReport(ErrorReport error);

    /** Updates state of the given error report. */
    void updateErrorReport(ErrorReport error);

    /** @return a list of all error reports */
    List<ErrorReport> getAllErrorReports();

    /**
     * @param fixedState a state of needed error reports
     *                   (true - for fixed errors, otherwise - false)
     * @return a list of error reports that have the given state (fixed or open)
     */
    List<ErrorReport> getErrorReportsByFixedState(boolean fixedState);

    /** @return a error report which has the given id */
    ErrorReport getErrorReportById(Long id);

    /** Deletes a error reports which has the given id. */
    void deleteErrorReport(Long id);
}
