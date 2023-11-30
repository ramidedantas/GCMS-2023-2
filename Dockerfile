# Usando imagem Ubuntu como base, �ltima vers�o (latest) 
FROM ubuntu:latest 
# Atualizando a base de pacotes de software 
RUN apt-get update 
# Instalando Gradle e OpenJDK (-y for�a a instala��o sem perguntar) 
RUN apt-get install -y gradle openjdk-17-jdk 
# Copiando a pasta do projeto (./) para uma pasta App dentro da imagem 
COPY ./ /App/
# Mudando o diret�rio de trabalho para o diret�rio do App 
WORKDIR /App/ 
# Rodando o gradle. Rodado ao executar docker start. 
CMD ./gradlew build 