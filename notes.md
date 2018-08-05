###[Maven]archetypeCatalog笔记
当我们使用maven原型生成项目骨架时，经常会在[INFO] Generating project in Interactive mode这个地方特别慢，这里并不是什么出错卡住的原因，你打开mvn的debug模式就可看到下面的信息：[DEBUG] Searching for remote catalog: http://repo.maven.apache.org/maven2/archetype-catalog.xml

他只是在寻找远程原型数据信息，而这个数据在外网并且还挺大，导致速度很慢，解决方式是我们手动下载这个archetype-catalog.xml文件到我们本地，把它放在.m2的目录下，.m2目录下也可以放置maven的配置文件，并且maven默认的本地仓库目录就在.m2的目录下面。.m2下面的maven配置文件比maven安装目录下的config目录下面的配置文件优先级高。因为.m2存在于当前用户的目录下，不同的用户有自己的maven配置习惯。

把archetype-catalog.xml放在.m2目录下后我们在使用mvn archetype:generate时在后面添加-DarchetypeCatalog=local 这时mvn会使用本地的原型数据来供你选择生成骨架的原型。

archetypeCatalog用来指定maven-archetype-plugin读取archetype-catalog.xml文件的位置：

internal——maven-archetype-plugin内置的

local——本地的，位置为~/.m2/archetype-catalog.xml

remote——指向Maven中央仓库的Catalog

file://

http://

###[maven repository url]
https://mvnrepository.com/

###[intellJIdea shortkeys on mac]
move line up/down:  command+shift+up/down

back/forward: command+option+left/right

generate: command+n

surround with: command+option+t


