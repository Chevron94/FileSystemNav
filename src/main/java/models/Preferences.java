package models;

// for customization of the service
public class Preferences {
    private String initialDirectory = "C:/";
    private Integer maxNestingLevel = 10;
    private Boolean showHiddenFiles = false;
    private Boolean showFoldersOnly = false;
    private Boolean showOpenableOnly = false;

    public Preferences() { }

    public Preferences(String initialDirectory, Integer maxNestingLevel, Boolean showOpenableOnly, Boolean showFoldersOnly, Boolean showHiddenFiles) {
        this.initialDirectory = initialDirectory;
        this.maxNestingLevel = maxNestingLevel;
        this.showHiddenFiles = showHiddenFiles;
        this.showFoldersOnly = showFoldersOnly;
        this.showOpenableOnly = showOpenableOnly;
    }

    public Boolean getShowHiddenFiles() {
        return showHiddenFiles;
    }

    public void setShowHiddenFiles(Boolean showHiddenFiles) {
        this.showHiddenFiles = showHiddenFiles;
    }

    public Boolean getShowFoldersOnly() {
        return showFoldersOnly;
    }

    public Integer getMaxNestingLevel() {
        return maxNestingLevel;
    }

    public void setMaxNestingLevel(Integer maxNestingLevel) {
        this.maxNestingLevel = maxNestingLevel;
    }

    public void setShowFoldersOnly(Boolean showFoldersOnly) {
        this.showFoldersOnly = showFoldersOnly;
    }

    public String getInitialDirectory() {
        return initialDirectory;
    }

    public void setInitialDirectory(String initialDirectory) {
        this.initialDirectory = initialDirectory;
    }

    public Boolean getShowOpenableOnly() {
        return showOpenableOnly;
    }

    public void setShowOpenableOnly(Boolean showOpenableOnly) {
        this.showOpenableOnly = showOpenableOnly;
    }

}
