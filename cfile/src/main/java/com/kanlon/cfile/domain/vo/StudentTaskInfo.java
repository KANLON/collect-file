package com.kanlon.cfile.domain.vo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 学生可以看到的项目信息
 *
 * @author zhangcanlong
 * @date 2018年11月30日
 */
@Data
public class StudentTaskInfo implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 任务名
	 */
	private String taskName;
	/**
	 * 任务截止时间
	 */
	private Date dendline;
	/**
	 * 提交的文件类型
	 */
	private String fileType;
	/**
	 * 应该要提交的总人数
	 */
	private Integer submitNum;
	/**
	 * 该项目备注
	 */
	private String remark;
	/**
	 * 该项目发布者
	 */
	private String publisher;
	/**
	 * 验证状态（0为未验证的，1为已验证，2是正在验证的）
	 */
	private Integer authentication;
}
