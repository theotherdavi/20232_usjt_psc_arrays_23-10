public class VetorDinamico {
    private int qtde;
    private int cap;
    private int[] elementos;

    public VetorDinamico() {
        qtde = 0;
        cap = 4;
        elementos = new int[cap];
    }

    public void add(int e) {
        elementos[qtde++] = e;
    }

    public void show() {
        System.out.printf("Qtde:%d\nCap: %d\n", qtde, cap);

        for (int e : elementos) {
            System.out.printf("%d ", e);
        }
    }

    public void increaseCap() {
        if (isFull()) {
            var aux = new int[cap * 2];
            for (int i = 0; i < cap; i++) {
                aux[i] = elementos[i];
            }
            cap *= 2;
            elementos = aux;
        } else
            ;
    }

    private boolean isFull() {
        if (elementos[cap - 1] != 0) {
            return true;
        } else
            return false;
    }

    private boolean isEmpty() {
        return qtde == 0 ? true : false;
    }

    public void remover() {
        if (isEmpty()) {
        } else {
            qtde--;
        }
    }
}
