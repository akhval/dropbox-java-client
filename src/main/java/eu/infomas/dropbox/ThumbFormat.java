/* SUPPRESS CHECKSTYLE RegexpHeader
 *
 * Copyright (c) 2009-2011 Dropbox, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package eu.infomas.dropbox;

/**
 * Represents the image format of thumbnails that the API can return.
 *
 * @author Original Author is Dropbox
 * @author <a href="mailto:rmuller@xiam.nl">Ronald K. Muller</a> (refactoring)
 * @since infomas-asl 3.0.2
 */
public enum ThumbFormat {

    /**
     * The PNG Image format.
     */
    PNG("image/png", ".png"),

    /**
     * The JPEG Image format.
     */
    JPEG("image/jpeg", ".jpg");

    private final String mimeType;
    private final String extension;

    private ThumbFormat(final String mimeType, final String extension) {
        this.mimeType = mimeType;
        this.extension = extension;
    }

    /**
     * Return the <a href="http://en.wikipedia.org/wiki/Internet_media_type">MIME Type</a>
     * of this image format.
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Return the default file extension of this image format.
     */
    public String getDefaultExtension() {
        return extension;
    }

}
