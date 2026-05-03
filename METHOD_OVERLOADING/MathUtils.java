package METHOD_OVERLOADING;

public class MathUtils {
    static int min(int a, int b){
        if(a<b)
            return a;
        else
            return b;
    }
    static double min(double [] mang){
        int len = mang.length;
        double min = mang[0];
        for(int i = 1; i < len; i++){
            if (min > mang[i]){
                min = mang[i];
            }
        }
        return min;
    }
    //2. tìm giá trị tuyệt 
    static int tri_tuyet_doi (int so){
        if(so > 0){
            return so;
        } else{
            so = so* -1;
            return so;
        }
    }
    //3. Tìm min và trả về mảng là min số đầu tiên
    static double [] thayTheMin (double [] mang){
        int len = mang.length;
        double min = mang[0];
    for (int i = 1; i < mang.length; i++) {
        if (min > mang[i]) {
            min = mang[i];
        }       
    } 
    mang[0] = min;
        return mang;
}
}
