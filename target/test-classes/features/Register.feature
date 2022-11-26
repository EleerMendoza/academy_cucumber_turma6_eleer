#language:pt
  @Register
  Funcionalidade: como usario do site Register
    Eu desejo realizar um cadastro
  Para realizar um cadastro com sucesso

    @test001
  Cenario: Validar cadastro com sucesso no site Registro

    Dado que acesso o site Register
      Quando preeencho o campo nome com valor "Eleer" e sobrenombre com valor "Mendoza"

    E preeencho o campo Address com valor "Av Cupece"
    E preeencho o campo emailAddress com valor "eleerdario12@gmail.com"
    E preeencho o campo phone com valor "11981882494"
    E clico o campo gender com valor "male"
    E clico o campo hobbies com valor "movies"
    E seleciono o campo skill com "Software"
    E clico o campo selectContry com valor "Japan"
    E seleciono o campo year com valor "1983"
    E seleciono o campo month com valor "May"
    E seleciono o campo day com valor "20"






