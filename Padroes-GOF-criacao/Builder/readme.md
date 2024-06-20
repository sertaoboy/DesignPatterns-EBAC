# Builder 
- Fornece uma ***interface generica*** para a construcao incremental de agregacoes. Esse padrao esconde os detahles de como os componentes sao criados, representados e compostos.
- ***Permite*** a criacao de objetos ***complexos***, ***passo a passo***.
- ***Separar*** a ***construcao de um objeto complexo*** de sua ***representacao***, de modo que o mesmo processo de construcao possa criar diferentes representacoes.
- "Esconder a logica da criacao" de um objeto complexo e permitir que o mesmo processo de construcao possa criar diferentes representacoes.

>- "Ao ir no balcao de um restaurante e pedir um hamburguer, voce nao sabe como ele e feito, mas o cozinheiro sabe. O Builder simula o cozinheiro atraves de instrucoes bem definidas para a criacao de um hamburguer." 
>- Este processo fica "escondido".

![Builder](https://github.com/sertaoboy/DesignPatterns-EBAC/blob/main/Padroes-GOF-criacao/Builder/builder.png?raw=true)

## Exemplo em UML:
![BuilderUML](https://github.com/sertaoboy/DesignPatterns-EBAC/blob/main/Padroes-GOF-criacao/Builder/BuildersUml.png?raw=true)


## Exemplo em Java:
```java
public class Product {
  private String name;
  private String type;
  private String size;
  private String color;

  public Product() {
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return "Product [name=" + name + ", type=" + type + ", size=" + size + ", color=" + color + "]";
  }
}

public interface ProductBuilder {
  void buildName();
  void buildType();
  void buildSize();
  void buildColor();
  Product getProduct();
}

public class ProductBuilderImpl implements ProductBuilder {
  private Product product;

  public ProductBuilderImpl() {
    product = new Product();
  }

  @Override
  public void buildName() {
    product.setName("Product Name");
  }

  @Override
  public void buildType() {
    product.setType("Product Type");
  }

  @Override
  public void buildSize() {
    product.setSize("Product Size");
  }

  @Override
  public void buildColor() {
    product.setColor("Product Color");
  }

  @Override
  public Product getProduct() {
    return product;
  }
}

public class ProductDirector {
  private ProductBuilder productBuilder;

  public ProductDirector(ProductBuilder productBuilder) {
    this.productBuilder = productBuilder;
  }

  public Product build() {
    productBuilder.buildName();
    productBuilder.buildType();
    productBuilder.buildSize();
    productBuilder.buildColor();
    return productBuilder.getProduct();
  }
}

public class DemoBuilder {
  public static void main(String[] args) {
    ProductBuilder productBuilder = new ProductBuilderImpl();
    ProductDirector productDirector = new ProductDirector(productBuilder);
    Product product = productDirector.build();
    System.out.println(product);
  }
}
```

## Exemplo em Python:
```python
class Product:
  def __init__(self):
    self.name = None
    self.type = None
    self.size = None
    self.color = None

  def __str__(self):
    return f'Product [name={self.name}, type={self.type}, size={self.size}, color={self.color}]'

class ProductBuilder:
    def __init__(self):
        self.product = Product()
    
    def build_name(self):
        self.product.name = 'Product Name'
    
    def build_type(self):
        self.product.type = 'Product Type'
    
    def build_size(self):
        self.product.size = 'Product Size'
    
    def build_color(self):
        self.product.color = 'Product Color'
    
    def get_product(self):
        return self.product

class ProductDirector:
    def __init__(self, product_builder):
        self.product_builder = product_builder
    
    def build(self):
        self.product_builder.build_name()
        self.product_builder.build_type()
        self.product_builder.build_size()
        self.product_builder.build_color()
        return self.product_builder.get_product()

product_builder = ProductBuilder()
product_director = ProductDirector(product_builder)
product = product_director.build()
print(product)
```

## Exemplo em JavaScript:
```javascript
class Product {
  constructor() {
    this.name = null;
    this.type = null;
    this.size = null;
    this.color = null;
  }

  toString() {
    return `Product [name=${this.name}, type=${this.type}, size=${this.size}, color=${this.color}]`;
  }
}

class ProductBuilder {
  constructor() {
    this.product = new Product();
  }

  buildName() {
    this.product.name = 'Product Name';
  }

  buildType() {
    this.product.type = 'Product Type';
  }

  buildSize() {
    this.product.size = 'Product Size';
  }

  buildColor() {
    this.product.color = 'Product Color';
  }

  getProduct() {
    return this.product;
  }
}

class ProductDirector {
  constructor(productBuilder) {
    this.productBuilder = productBuilder;
  }

  build() {
    this.productBuilder.buildName();
    this.productBuilder.buildType();
    this.productBuilder.buildSize();
    this.productBuilder.buildColor();
    return this.productBuilder.getProduct();
  }
}

const productBuilder = new ProductBuilder();
const productDirector = new ProductDirector(productBuilder);
const product = productDirector.build();
console.log(product.toString());
```


