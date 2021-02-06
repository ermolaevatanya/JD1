package HomeWork6;

public class NBRBLoader extends SiteLoader{

    /**
     * Метод для запуска загрузки курса валют
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(SiteLoader.Currency currencyName) {
        return load("https://www.nbrb.by/api/exrates/rates/" + currencyName.getId(), currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     * @param content то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    protected double handle(String content, SiteLoader.Currency currencyName) {
        String rate = content.substring(content.indexOf("Cur_OfficialRate"));
        rate = rate.substring(rate.indexOf(":"), rate.indexOf("}"));
        rate = currencyName + " : " + rate.substring(1);
        double currencyRate = Double.parseDouble(rate.substring(rate.indexOf(" ")));
        return currencyRate;
    }
}

