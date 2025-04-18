FROM mcr.microsoft.com/devcontainers/java:21

# Install any additional dependencies if needed
RUN apt-get update && apt-get install -y \
    maven \
    && apt-get clean