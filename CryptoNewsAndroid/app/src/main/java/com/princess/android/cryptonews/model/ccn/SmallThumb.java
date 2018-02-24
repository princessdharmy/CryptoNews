package com.princess.android.cryptonews.model.ccn;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class SmallThumb{

	@SerializedName("file")
	private String file;

	@SerializedName("mime_type")
	private String mimeType;

	@SerializedName("width")
	private int width;

	@SerializedName("source_url")
	private String sourceUrl;

	@SerializedName("height")
	private int height;

	public void setFile(String file){
		this.file = file;
	}

	public String getFile(){
		return file;
	}

	public void setMimeType(String mimeType){
		this.mimeType = mimeType;
	}

	public String getMimeType(){
		return mimeType;
	}

	public void setWidth(int width){
		this.width = width;
	}

	public int getWidth(){
		return width;
	}

	public void setSourceUrl(String sourceUrl){
		this.sourceUrl = sourceUrl;
	}

	public String getSourceUrl(){
		return sourceUrl;
	}

	public void setHeight(int height){
		this.height = height;
	}

	public int getHeight(){
		return height;
	}

	@Override
 	public String toString(){
		return 
			"SmallThumb{" + 
			"file = '" + file + '\'' + 
			",mime_type = '" + mimeType + '\'' + 
			",width = '" + width + '\'' + 
			",source_url = '" + sourceUrl + '\'' + 
			",height = '" + height + '\'' + 
			"}";
		}
}