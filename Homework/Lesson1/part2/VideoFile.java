public class VideoFile {
	public char vfttl; // title of the video file
	public char vflan; // language of video file
	public char vffrm; // video format
	public short vflen; // lenght in minutes
	private short vffps; // number of frames per second
	public float vfsze; // size in gigabytes
	private short vfhres; // horizontal resolution in pixels
	private short vfvres; // vertical  resolution in pixels
	private short vfbitr; // pixel bit rate in millions
	private int vfsnd; // sound frequency in gygahertz
	public boolean vfbw; // black and white movie
	public boolean vfsub; // include subtitles
	
	public doLaun(); // to launch a video file
	public doClose(); // to shut down a video file
	public doPlay(); // to play a video file
	public doPaus(); // to set a video file on pause
	public doStop(); // to stop a video file
	private doRew(); // to rewind a video file
	private makeSpdF(); // to make video file go faster
	private makeSpdS(); // to make video file go slower
	public moveVol(); // to change volume
	private doMut(); // to turn off motuion picture volume
}

