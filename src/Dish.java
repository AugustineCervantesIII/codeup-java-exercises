//public
class Dish {
    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;


//    public int costInCents;
//    public String nameOfDish;
//    public boolean wouldRecommend;


    public void printSummary() {
        System.out.printf("cost: $%s.00\nname: %s\nrecommended: %s", costInCents, nameOfDish, wouldRecommend);
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public int getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public boolean getWouldRecommend() {
        return wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

}
