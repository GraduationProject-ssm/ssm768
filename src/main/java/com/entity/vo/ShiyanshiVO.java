package com.entity.vo;

import com.entity.ShiyanshiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 实验室
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shiyanshi")
public class ShiyanshiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 实验室名称
     */

    @TableField(value = "shiyanshi_name")
    private String shiyanshiName;


    /**
     * 实验室类型
     */

    @TableField(value = "shiyanshi_types")
    private Integer shiyanshiTypes;


    /**
     * 实验室位置
     */

    @TableField(value = "shiyanshi_address")
    private String shiyanshiAddress;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 实验室详情
     */

    @TableField(value = "shiyanshi_content")
    private String shiyanshiContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：实验室名称
	 */
    public String getShiyanshiName() {
        return shiyanshiName;
    }


    /**
	 * 获取：实验室名称
	 */

    public void setShiyanshiName(String shiyanshiName) {
        this.shiyanshiName = shiyanshiName;
    }
    /**
	 * 设置：实验室类型
	 */
    public Integer getShiyanshiTypes() {
        return shiyanshiTypes;
    }


    /**
	 * 获取：实验室类型
	 */

    public void setShiyanshiTypes(Integer shiyanshiTypes) {
        this.shiyanshiTypes = shiyanshiTypes;
    }
    /**
	 * 设置：实验室位置
	 */
    public String getShiyanshiAddress() {
        return shiyanshiAddress;
    }


    /**
	 * 获取：实验室位置
	 */

    public void setShiyanshiAddress(String shiyanshiAddress) {
        this.shiyanshiAddress = shiyanshiAddress;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：实验室详情
	 */
    public String getShiyanshiContent() {
        return shiyanshiContent;
    }


    /**
	 * 获取：实验室详情
	 */

    public void setShiyanshiContent(String shiyanshiContent) {
        this.shiyanshiContent = shiyanshiContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}