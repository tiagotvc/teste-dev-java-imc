# teste-dev-java-imc

Para instalação apenas é necessário ter um banco postgresql instalado e executar a seguinte query:

createdb -U seuUsuario dbteste

Após isso, importar o projeto para o Eclipse ou IDE de preferencia e executar e rodar a aplicação.

EndPoints:

utilizei o Postman para testar:

Salvar dados no banco: http://localhost:8080/pessoas

Listar por numero de cpf: http://localhost:8080/pessoas/numeroDoCpfAqui

Listar por id: http://localhost:8080/pessoas/numeroDoIdaqui

Mostrar todos os calculo:Não consegui fazer os calculos na camada de serviço. Os calculos são feitos automaticos quando passado o 
peso e altura no metodo de salvar, mas não são salvos no banco, o mesmo ocorre com classificação.

Foi o melhor que consegui fazer com o conhecimento atual.

Agradeço a oportunidade.

