package com.github.alexthe666.iceandfire.world.structure;

public class GorgonTempleStructure /*extends Structure*/ {
    /*TODO:
    public static final Codec<GorgonTempleStructure> CODEC = simpleCodec(GorgonTempleStructure::new);

    public GorgonTempleStructure(StructureSettings settings) {
        super(settings);
    }

    public static @NotNull Optional<PieceGenerator<JigsawConfiguration>> createPiecesGenerator(PieceGeneratorSupplier.Context<JigsawConfiguration> context) {
        if (!IafConfig.spawnGorgons) {
            return Optional.empty();
        }
        ChunkGenerator chunkGenerator = context.chunkGenerator();
        ChunkPos pos = context.chunkPos();
        LevelHeightAccessor height = context.heightAccessor();
        Rotation rotation = Rotation.getRandom(ThreadLocalRandom.current());
        int xOffset = 5;
        int yOffset = 5;
        if (rotation == Rotation.CLOCKWISE_90) {
            xOffset = -5;
        } else if (rotation == Rotation.CLOCKWISE_180) {
            xOffset = -5;
            yOffset = -5;
        } else if (rotation == Rotation.COUNTERCLOCKWISE_90) {
            yOffset = -5;
        }


        int x = pos.getMiddleBlockX();
        int z = pos.getMiddleBlockZ();
        int y1 = chunkGenerator.getFirstOccupiedHeight(x, z, Heightmap.Types.WORLD_SURFACE_WG, height);
        int y2 = chunkGenerator.getFirstOccupiedHeight(x, z + yOffset, Heightmap.Types.WORLD_SURFACE_WG, height);
        int y3 = chunkGenerator.getFirstOccupiedHeight(x + xOffset, z, Heightmap.Types.WORLD_SURFACE_WG, height);
        int y4 = chunkGenerator.getFirstOccupiedHeight(x + xOffset, z + yOffset, Heightmap.Types.WORLD_SURFACE_WG, height);
        int yMin = Math.min(Math.min(y1, y2), Math.min(y3, y4));
        BlockPos blockpos = pos.getMiddleBlockPosition(yMin + 2);

        context = Pool.replaceContext(context, new JigsawConfiguration(
                context.registryAccess().ownedRegistryOrThrow(Registry.TEMPLATE_POOL_REGISTRY).getOrCreateHolder(Pool.gorgon_pool),
                3 // Depth of jigsaw branches. Gorgon temple has a depth of 3. (start top -> bottom -> gorgon)
            )
        );

        // All a structure has to do is call this method to turn it into a jigsaw based structure!
        // No manual pieces class needed.
        return JigsawPlacement.addPieces(context, PoolElementStructurePiece::new, blockpos, false, false);
    }

    @Override
    public GenerationStep.@NotNull Decoration step() {
        return GenerationStep.Decoration.SURFACE_STRUCTURES;
    }

    static class PostPlacement implements PostPlacementProcessor {
        @Override
        public void afterPlace(@NotNull WorldGenLevel pLevel, @NotNull StructureFeatureManager pManager, @NotNull ChunkGenerator pGenerator, @NotNull Random pRandom, @NotNull BoundingBox pBoundingBox, @NotNull ChunkPos pChunkPos, PiecesContainer pContainer) {
            pContainer.calculateBoundingBox();
        }
    }*/
}
