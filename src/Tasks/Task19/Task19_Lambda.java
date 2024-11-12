package Tasks.Task19;

public class Task19_Lambda {
    public static void main(String[] args) {
        //Task 1
        Operation<Double> doubleOperation = (a) -> {
            double result = 0.0;
            for (Double value : a) {
                if (value % 2 == 0)
                    result += value;
            }
            return result;
        };

        Double[] doubles = {2.0, 2.2, 3.1, 4.0};

        System.out.println(doubleOperation.operation(doubles));

        //Task 2
        OperationString operationString = (a) -> {
            String maxLengthResult = "";
            for (String value : a) {
                if (value.length() > maxLengthResult.length())
                    maxLengthResult = value;
            }

            return maxLengthResult;
        };

        String[] strings = {"Привет", "Проверяющий", "Как", "Дела?"};
        System.out.println(operationString.operation(strings));
    }

    @FunctionalInterface
    interface Operation<T extends Number> {
        T operation(T[] numbers);
    }

    @FunctionalInterface
    interface OperationString {
        String operation(String[] strings);
    }

}
