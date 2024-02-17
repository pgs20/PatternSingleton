import java.util.ArrayList;
import java.util.List;

public class Filter {
    private int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем фильтрацию");
        List<Integer> res = new ArrayList<>();
        for (Integer x : source) {
            if ((x.intValue() < this.treshold)) {
                logger.log("Элемент " + x + " не проходит");
            } else {
                logger.log("Элемент " + x + " проходит");
                res.add(x);
            }
        }
        logger.log("Прошло фильтр " + res.size() + " элемента из " + source.size());
        return res;
    }
}
