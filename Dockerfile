FROM mcr.microsoft.com/playwright:v1.38.0-jammy

RUN apt-get update && \
    apt-get upgrade -y && \
    apt-get install -y maven

COPY ./ ./SpriteCloud_QAAssignment
WORKDIR SpriteCloud_QAAssignment