public class simple_num {
    public static void main(String[] args) {

        for (int i = 1; i < 1000; ++i){
            int count = 0;
            for(int j = 2; j <= i && count < 2; ++j){
              if (i % j==0){
                ++count;
              }
            }
            if (count < 2)
               System.out.println(i);
          }
    }
}
