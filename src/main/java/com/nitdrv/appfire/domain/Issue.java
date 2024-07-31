package com.nitdrv.appfire.domain;

import java.util.List;

public class Issue {

    private String key;
    private Fields fields;

    public static class Fields {

        private String summary;
        private String description;
        private IssueType issuetype;
        private Priority priority;
        private User reporter;
        private String updated;
        private List<Comment> comment;

        public static class IssueType {

            private String name;

            // getters and setters

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        public static class Priority {

            private String id;

            // getters and setters

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }
        }

        public static class User {

            private String name;
            private String displayName;

            // getters and setters

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getDisplayName() {
                return displayName;
            }

            public void setDisplayName(String displayName) {
                this.displayName = displayName;
            }
        }

        public static class Comment {

            private String body;
            private User author;

            // getters and setters

            public String getBody() {
                return body;
            }

            public void setBody(String body) {
                this.body = body;
            }

            public User getAuthor() {
                return author;
            }

            public void setAuthor(User author) {
                this.author = author;
            }
        }

        // getters and setters

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public IssueType getIssuetype() {
            return issuetype;
        }

        public void setIssuetype(IssueType issuetype) {
            this.issuetype = issuetype;
        }

        public Priority getPriority() {
            return priority;
        }

        public void setPriority(Priority priority) {
            this.priority = priority;
        }

        public User getReporter() {
            return reporter;
        }

        public void setReporter(User reporter) {
            this.reporter = reporter;
        }

        public String getUpdated() {
            return updated;
        }

        public void setUpdated(String updated) {
            this.updated = updated;
        }

        public List<Comment> getComment() {
            return comment;
        }

        public void setComment(List<Comment> comment) {
            this.comment = comment;
        }
    }

    // getters and setters

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Fields getFields() {
        return fields;
    }

    public void setFields(Fields fields) {
        this.fields = fields;
    }
}
