FROM java:alpine
ADD target/GraphqlFeedbackPAI.jar GraphqlFeedbackPAI
EXPOSE 8078
ENTRYPOINT ["java", "-jar", "GraphqlFeedbackPAI"]