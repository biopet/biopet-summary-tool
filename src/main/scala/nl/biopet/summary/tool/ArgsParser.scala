package nl.biopet.summary.tool

import java.io.File

import nl.biopet.utils.tool.AbstractOptParser

class ArgsParser extends AbstractOptParser[Args]("summary") {
  opt[File]("h2File").abbr("h2").unbounded().maxOccurs(1).action((x, c) => c.copy(h2File = Some(x)))
  opt[String]("jdbcUrl").abbr("jdbc").unbounded().maxOccurs(1).action((x, c) => c.copy(jdbc = Some(x)))
  opt[String]("project").abbr("p").unbounded().maxOccurs(1).action((x, c) => c.copy(projectName = Some(x)))
  opt[String]("run").abbr("r").unbounded().maxOccurs(1).action((x, c) => c.copy(runName = Some(x)))
  opt[String]("pipeline").abbr("pi").unbounded().maxOccurs(1).action((x, c) => c.copy(pipelineName = Some(x)))
  opt[String]("module").abbr("m").unbounded().maxOccurs(1).action((x, c) => c.copy(moduleName = Some(x)))
  opt[String]("sample").abbr("s").unbounded().maxOccurs(1).action((x, c) => c.copy(sampleName = Some(x)))
  opt[String]("library").abbr("lib").unbounded().maxOccurs(1).action((x, c) => c.copy(libraryName = Some(x)))
  opt[String]("readgroup").abbr("rg").unbounded().maxOccurs(1).action((x, c) => c.copy(readgroupName = Some(x)))
  opt[String]("method").required().unbounded().maxOccurs(1).action((x, c) => c.copy(method = x))
  opt[String]("outputDir").unbounded().maxOccurs(1).action((x, c) => c.copy(outputDir = Some(x)))
  opt[String]("runVersion").unbounded().maxOccurs(1).action((x, c) => c.copy(version = Some(x)))
  opt[String]("commitHash").unbounded().maxOccurs(1).action((x, c) => c.copy(commitHash = Some(x)))
}
