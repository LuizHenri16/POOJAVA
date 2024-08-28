public class Samsung implements funções{

    String marca;
    String categoria;
    String modelo;
    String versao;
    String cor;
    Integer armazenamento;
    Integer ram;
    float largura;
    float comprimento;
    float altura;

        public void status() {
            System.out.println("Marca: " + getMarca());
            System.out.println("Modelo: " + getModelo());
            System.out.println("Cor: " + getCor());
            System.out.println("Versão: " + getVersao());
        };

        public void status2() {
            if (getCategoria() == "Smartphone" || getCategoria() == "Televisor") {
                System.out.println("Armazenamento: " + getArmazenamento() + "GB");
                System.out.println("RAM: " + getRam() + "GB");
            } else {
                System.out.println("Esse produto não possui armazenamento");
                System.out.println("Esse produto não possui memoria RAM");
            };
        }
    @Override
    public void updateModelo(String ModeloUpdate) {
            setModelo(ModeloUpdate);
    }




    public Samsung(String categoria, String modelo, String versao, String cor, float largura, float comprimento, float altura) {
        setMarca("Samsung");
        setCategoria(categoria);
        setModelo(modelo);
        setVersao(versao);
        setCor(cor);
        setLargura(largura);
        setComprimento(comprimento);
        setAltura(altura);
        }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(Integer armazenamento) {
        this.armazenamento = armazenamento;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }


}
