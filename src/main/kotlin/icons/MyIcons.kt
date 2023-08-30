package icons

import com.intellij.openapi.util.IconLoader.getIcon
import javax.swing.Icon


object MyIcons {
    @JvmField
    val PS: Icon = getIcon("/META-INF/fileType.svg", javaClass)

    @JvmField
    val SA: Icon = getIcon("/META-INF/switchAction.svg.svg", javaClass)
}