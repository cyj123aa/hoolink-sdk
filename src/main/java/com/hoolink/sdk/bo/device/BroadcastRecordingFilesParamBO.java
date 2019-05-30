package com.hoolink.sdk.bo.device;

/**
 * @version V1.0
 * @classname:BroadcastRecordingFilesParamBO
 * @author: xiaolei.yang
 * @date: 2019/5/17 15:11
 * @Description 世邦录音文件BO
 **/
public class BroadcastRecordingFilesParamBO {
    /**
     * 文件url
     */
    private String file;

    /**
     * 事件记录id（作为录音文件的名称组成部分）
     */
    private String eventId;

    /**
     * 事件记录的会话id
     */
    private String sequenceId;

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getSequenceId() {
        return sequenceId;
    }

    public void setSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
    }
}
