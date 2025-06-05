package io.github.vishalmysore.service;

import com.t4a.annotations.Action;
import com.t4a.annotations.Agent;
import com.t4a.detect.ActionCallback;
import com.t4a.detect.ActionState;
import com.t4a.processor.AIProcessor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

/**
 * Service to compare two employees based on their characteristics.
 */
@Service
@Log
@Agent(groupName ="compareEmployee", groupDescription = "Provide 2 employees and compare them")
public class EmployeeComparatorService {
    private ActionCallback callback;
    private AIProcessor processor;

    public EmployeeComparatorService() {
        log.info("created compare employee service");
    }

    @Action(description = "compare 2 employees")
    public String compareEmployee(String empName1, String empName2) {
        // Placeholder logic: just compare names alphabetically
        String result;
        int cmp = empName1.compareToIgnoreCase(empName2);
        if (cmp < 0) {
            result = empName1 + " is better than " + empName2;
        } else if (cmp > 0) {
            result = empName2 + " is better than " + empName1;
        } else {
            result = empName1 + " and " + empName2 + " are equally matched.";
        }
        if (callback != null) {
            callback.sendtStatus(result, ActionState.COMPLETED);
        }
        return result;
    }
}
