public class Chaos
{
    public static void main(String[] args)
    {
        double x = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);

        int i; //iterations
        double test = 1 - (1 / r);

        for (i = 0; i < 100; i++)
            if (x < 1)
            {
                r += 0.1;
                x = populationGrowth(x, r);
                System.out.println("Population: " + x);
            }
            else { System.out.println("Stablize value:" + test); return; }

    }

    private static double populationGrowth( double Population, double GrowthParameter)
    {
        return (GrowthParameter * Population * (1 - Population));
    }
}
