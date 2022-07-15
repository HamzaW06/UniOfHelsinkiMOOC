public class Figure {
    private String identity;
    private String name;

    public Figure(String identity, String name) {
        this.identity = identity;
        this.name = name;
    }
    public boolean equals(Object compared){
        if (this == compared){
            return true;
        }
        if (!(compared instanceof Figure)){
            return false;
        }
        Figure comparedFigure = (Figure) compared;

        if (this.identity.equals(comparedFigure.identity) ){
            return true;
        }
        return false;
    }
    public String toString(){
        return (identity + ": " + name);
    }
}
