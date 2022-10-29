public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

public void smartLigada () {
    ligada = true;

}

public void smartDesligada () {
    ligada = false;

}

public int aumentarVolume () {
    return volume++;
}

public int diminuirVolume () {
    return volume--;
}

public int aumentarCanal () {
    return canal++;
}

public void mudarCanal (int novoCanal) {
    canal = novoCanal;

}

public int diminuirCanal () {
    return canal--;
}

}