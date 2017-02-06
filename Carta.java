public class Carta{

    private int palo;
    private int num;

    public Carta(int palo, int num){
		this.palo=palo;
		this.num=num;
    }

    public int getNum(){
    	return num;
    }

    public int getPalo(){
    	return palo;
	}

    public String getNombrePalo(){
        String nom = "";
        switch (palo){
            case 0:
                nom = "Corazones";
                break;
            case 1:
                nom = "Diamantes";
                break;
            case 2:
                nom = "Espadas";
                break;
            case 3:
                nom = "Treboles";
                break;
            case 4:
                nom = "Joker";
                break;
            }
        return nom;
    }

    public String getNombreNum(){
        String nom = "";
        switch(num){
            case 1:
                nom = "Az";
                break;
            case 11:
                nom = "Joto";
                break;
            case 12:
                nom = "Quina";
                break;
            case 13:
                nom = "Rey";
                break;
            case 14:
                nom = "Joker";
            default:
                nom = Integer.toString(num);
                break;
        }
        return nom;
    }

    public String getNombreCarta(){
        String nom = "";
        if(palo<4){
            nom = (this.getNombreNum()) + " de " + (this.getNombrePalo());
        } else {
            nom = "Joker";
        }
        return nom;
    }
}