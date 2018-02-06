
public class DataProvider {
    public static int nFields = 64;
    public static int nFieldsX = 8;
    public static int nFieldsY = 8;

    public static String[] emoticons = {":D", ":(", ":|", ";/"};
    public static double[][][] correct = new double[][][]{
            {
                    {0, 0, 1, 1, 1, 1, 0, 0},
                    {0, 1, 0, 0, 0, 0, 1, 0},
                    {1, 0, 1, 0, 0, 1, 0, 1},
                    {1, 0, 0, 0, 0, 0, 0, 1},
                    {1, 0, 1, 1, 1, 1, 0, 1},
                    {1, 0, 0, 1, 1, 0, 0, 1},
                    {0, 1, 0, 0, 0, 0, 1, 0},
                    {0, 0, 1, 1, 1, 1, 0, 0}
            },

            {
                    {0, 0, 1, 1, 1, 1, 0, 0},
                    {0, 1, 0, 0, 0, 0, 1, 0},
                    {1, 0, 1, 0, 0, 1, 0, 1},
                    {1, 0, 0, 0, 0, 0, 0, 1},
                    {1, 0, 1, 1, 1, 1, 0, 1},
                    {1, 0, 1, 0, 0, 1, 0, 1},
                    {0, 1, 0, 0, 0, 0, 1, 0},
                    {0, 0, 1, 1, 1, 1, 0, 0}
            },
            {
                    {0, 0, 1, 1, 1, 1, 0, 0},
                    {0, 1, 0, 0, 0, 0, 1, 0},
                    {1, 0, 1, 0, 0, 1, 0, 1},
                    {1, 0, 1, 0, 0, 1, 0, 1},
                    {1, 0, 0, 0, 0, 0, 0, 1},
                    {1, 0, 1, 1, 1, 1, 0, 1},
                    {0, 1, 0, 0, 0, 0, 1, 0},
                    {0, 0, 1, 1, 1, 1, 0, 0}
            },
            {
                    {0, 0, 1, 1, 1, 1, 0, 0},
                    {0, 1, 0, 0, 0, 0, 1, 0},
                    {1, 0, 1, 1, 0, 1, 0, 1},
                    {1, 0, 0, 0, 0, 0, 0, 1},
                    {1, 0, 1, 0, 0, 0, 0, 1},
                    {1, 0, 0, 1, 1, 0, 0, 1},
                    {0, 1, 0, 0, 0, 1, 1, 0},
                    {0, 0, 1, 1, 1, 1, 0, 0}
            }
    };
    public static double[] expected = {0, 1, 2, 3};
    public static double[][][] corrupted = new double[][][]{
            {
                    {0, 0, 1, 1, 1, 1, 0, 0},
                    {0, 1, 0, 0, 0, 0, 0, 0},
                    {0, 0, 1, 0, 0, 1, 0, 1},
                    {1, 0, 0, 0, 0, 0, 0, 1},
                    {1, 0, 1, 1, 0, 1, 0, 1},
                    {1, 0, 0, 1, 1, 0, 0, 1},
                    {0, 1, 0, 0, 0, 0, 1, 0},
                    {0, 0, 1, 1, 1, 0, 0, 0}
            },
            {
                    {0, 0, 1, 1, 0, 1, 0, 0},
                    {0, 1, 0, 0, 0, 0, 1, 0},
                    {1, 0, 1, 0, 0, 1, 0, 1},
                    {0, 0, 0, 0, 0, 0, 0, 1},
                    {1, 0, 0, 1, 1, 0, 0, 1},
                    {1, 0, 1, 0, 0, 1, 0, 1},
                    {0, 1, 0, 0, 0, 0, 1, 0},
                    {0, 0, 0, 1, 1, 1, 0, 0}
            },
            {
                    {0, 0, 1, 1, 1, 0, 0, 0},
                    {0, 1, 0, 0, 0, 1, 0, 0},
                    {1, 0, 1, 0, 0, 1, 0, 1},
                    {1, 0, 1, 0, 0, 1, 0, 1},
                    {1, 0, 0, 0, 0, 0, 0, 1},
                    {1, 0, 1, 0, 1, 1, 0, 1},
                    {0, 1, 0, 0, 0, 0, 1, 0},
                    {0, 0, 1, 1, 1, 0, 0, 0}
            },
            {
                    {0, 0, 1, 0, 1, 1, 0, 0},
                    {0, 1, 0, 0, 0, 0, 1, 0},
                    {1, 0, 1, 1, 1, 1, 0, 1},
                    {1, 0, 0, 0, 0, 0, 0, 1},
                    {1, 0, 1, 0, 0, 0, 0, 1},
                    {1, 0, 0, 1, 1, 1, 0, 0},
                    {0, 1, 0, 0, 0, 1, 1, 0},
                    {0, 0, 1, 0, 1, 1, 0, 0}
            }
    };

    public static double[] getData(int number, double[][][] data) {
        double[] result = new double[nFields];
        for (int i = 0; i < nFieldsY; i++) {
            for (int j = 0; j < nFieldsX; j++) {
                result[i * nFieldsX + j] = data[number][i][j];
            }
        }

        return result;
    }
}
