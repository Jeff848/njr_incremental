package ch.obermuhlner.jhuge.collection;

import ch.obermuhlner.jhuge.memory.MemoryManager;
import ch.obermuhlner.jhuge.memory.MemoryMappedFileManager;

/**
 * Tests {@link ImmutableHugeArrayList} with a {@link MemoryMappedFileManager}.
 */
public class MemoryMappedFile_ImmutableHugeArrayListTest extends AbstractImmutableHugeArrayListTest {

	@Override
	protected MemoryManager createMemoryManager() {
		return new MemoryMappedFileManager(20000);
	}

	@Override
	protected boolean isFaster() {
		return false;
	}
}
