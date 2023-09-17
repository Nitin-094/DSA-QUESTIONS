public class directions {


    static float getShortestPath(String path){

    int x=0 , y=0;
        for (int i = 0; i < path.length(); i++) {

            char dir = path.charAt(i);
            if(dir == 'N' | dir == 'n'){
                y++;
            }
            else if(dir == 'S' | dir == 's'){
                y--;
            }
            else if(dir == 'E' | dir == 'e'){
                x--;
            }
            else if(dir == 'W' | dir == 'w'){
                x++;
            }



        }
        int x2 = x*x , y2=y*y;
        float distance = (float)Math.sqrt(x2+y2);

    return distance;

    }


    public static void main(String[] args) {

        String str = "nsSSSSSS";

        System.out.println(getShortestPath(str));


    }


}
