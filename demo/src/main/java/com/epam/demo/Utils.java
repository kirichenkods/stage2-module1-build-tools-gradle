package com.epam.demo;

import java.util.List;
import com.epam.utils.*;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        args.forEach(item -> {
            if (!StringUtils.isPositiveNumber(item)) {
                return false;
            }
        });

        return true;
    }
}