public class Hammurabi {

    public static int immigrants(int population,int acresOwned,int grainInStorage){
        return (20 * acresOwned + grainInStorage)/(100 * population) +1;

    }

    public static int starvationDeaths(int population, int bushelsFedtoPeople){
        if(population *20 <= bushelsFedtoPeople) return 0;
        else return population - (bushelsFedtoPeople/20);
    }

    public static boolean uprising(int population, int howManyPeopleSarved){
        return (((double)howManyPeopleSarved/population) >= .45);
    }

}
