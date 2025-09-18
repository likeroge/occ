# Dockerfile (multi-stage) — Maven
ARG MAVEN_IMAGE=eclipse-temurin:17-jdk-alpine
ARG RUNTIME_IMAGE=eclipse-temurin:17-jre-jammy

FROM ${MAVEN_IMAGE} AS build
WORKDIR /workspace

# Копируем pom и wrapper для кэширования зависимостей
COPY pom.xml mvnw* ./
COPY .mvn .mvn
RUN mvn -B -f pom.xml -DskipTests dependency:go-offline

# Копируем исходники и собираем
COPY src ./src
RUN mvn -B -f pom.xml -DskipTests package

# Имя итогового jar (можно переопределить через --build-arg JAR_FILE=target/myapp.jar)
ARG JAR_FILE=target/*.jar

FROM ${RUNTIME_IMAGE} AS runtime
# Создаём непривилегированного пользователя
RUN useradd --create-home appuser || true
WORKDIR /home/appuser

COPY --from=build /workspace/${JAR_FILE} app.jar
RUN chown appuser:appuser app.jar
USER appuser

EXPOSE 5000
ENV JAVA_TOOL_OPTIONS="-Xms256m -Xmx512m"

ENTRYPOINT ["sh","-c","java $JAVA_TOOL_OPTIONS -jar /home/appuser/app.jar"]