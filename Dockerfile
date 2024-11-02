# Etapa 1: Construcción de la aplicación
FROM gradle:7.6.0-jdk17 AS builder

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar archivos de configuración de Gradle y descargar dependencias
COPY build.gradle /app/
RUN gradle build --no-daemon || return 0

# Copiar el código fuente
COPY src /app/src

# Compilar la aplicación
RUN gradle build --no-daemon

# Etapa 2: Imagen final para ejecutar la aplicación
FROM openjdk:17-jdk-slim AS runner

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar el JAR compilado desde la etapa de construcción
COPY --from=builder /app/build/libs/*.jar /app/app.jar

# Ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
